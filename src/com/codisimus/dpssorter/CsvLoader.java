package com.codisimus.dpssorter;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class CsvLoader {
    public static <T> List<T> load(String fileName, Class<T> t) throws IOException {
        return load(fileName, t, t.getConstructors()[0].getParameterTypes());
    }
    public static <T> List<T> load(String fileName, Class<T> t, Class... classes) throws IOException {
        List<T> list = new LinkedList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(line -> {
                Object[] values = new Object[classes.length];
                String[] parameters = line.split(",");
                for (int i = 0; i < classes.length; i++) {
                    values[i] = getValue(classes[i], parameters[i]);
                }
                try {
                    T item = (T) t.getConstructor(classes).newInstance(values);
                    list.add(item);
                } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    throw new RuntimeException(ex);
                }
            });
        }
        return list;
    }

    private static <T> T getValue(Class<T> type, String string) {
        Object value;
        if (type == String.class) {
            value = string;
        } else if (type == int.class || type == Integer.class) {
            value = Integer.parseInt(string);
        } else if (type == double.class || type == Double.class) {
            value = Double.parseDouble(string);
        } else if (type == long.class || type == Long.class) {
            value = Long.parseLong(string);
        } else if (type == float.class || type == Float.class) {
            value = Float.parseFloat(string);
        } else if (type == short.class || type == Short.class) {
            value = Short.parseShort(string);
        } else if (type.isEnum()) {
            try {
                value = type.getMethod("valueOf", String.class).invoke(null, string);
            } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                throw new RuntimeException(ex);
            }
        } else {
            try {
                value = type.getConstructor(String.class).newInstance(string);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                throw new RuntimeException(ex);
            }
        }
        return (T) value;
    }
}
