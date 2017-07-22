package com.codisimus.dpssorter;

import java.util.HashMap;
import java.util.Map;

public class PoGoUtil {
    private static final Map<Double, Double> CPM_TABLE;
    static {
        CPM_TABLE = new HashMap<>();
        CPM_TABLE.put(1.0, 0.094);
        CPM_TABLE.put(1.5, 0.135137432);
        CPM_TABLE.put(2.0, 0.16639787);
        CPM_TABLE.put(2.5, 0.192650919);
        CPM_TABLE.put(3.0, 0.21573247);
        CPM_TABLE.put(3.5, 0.236572661);
        CPM_TABLE.put(4.0, 0.25572005);
        CPM_TABLE.put(4.5, 0.273530381);
        CPM_TABLE.put(5.0, 0.29024988);
        CPM_TABLE.put(5.5, 0.306057377);
        CPM_TABLE.put(6.0, 0.3210876);
        CPM_TABLE.put(6.5, 0.335445036);
        CPM_TABLE.put(7.0, 0.34921268);
        CPM_TABLE.put(7.5, 0.362457751);
        CPM_TABLE.put(8.0, 0.37523559);
        CPM_TABLE.put(8.5, 0.387592406);
        CPM_TABLE.put(9.0, 0.39956728);
        CPM_TABLE.put(9.5, 0.411193551);
        CPM_TABLE.put(10.0, 0.42250001);
        CPM_TABLE.put(10.5, 0.432926419);
        CPM_TABLE.put(11.0, 0.44310755);
        CPM_TABLE.put(11.5, 0.4530599578);
        CPM_TABLE.put(12.0, 0.46279839);
        CPM_TABLE.put(12.5, 0.472336083);
        CPM_TABLE.put(13.0, 0.48168495);
        CPM_TABLE.put(13.5, 0.4908558);
        CPM_TABLE.put(14.0, 0.49985844);
        CPM_TABLE.put(14.5, 0.508701765);
        CPM_TABLE.put(15.0, 0.51739395);
        CPM_TABLE.put(15.5, 0.525942511);
        CPM_TABLE.put(16.0, 0.53435433);
        CPM_TABLE.put(16.5, 0.542635767);
        CPM_TABLE.put(17.0, 0.55079269);
        CPM_TABLE.put(17.5, 0.558830576);
        CPM_TABLE.put(18.0, 0.56675452);
        CPM_TABLE.put(18.5, 0.574569153);
        CPM_TABLE.put(19.0, 0.58227891);
        CPM_TABLE.put(19.5, 0.589887917);
        CPM_TABLE.put(20.0, 0.59740001);
        CPM_TABLE.put(20.5, 0.604818814);
        CPM_TABLE.put(21.0, 0.61215729);
        CPM_TABLE.put(21.5, 0.619399365);
        CPM_TABLE.put(22.0, 0.62656713);
        CPM_TABLE.put(22.5, 0.633644533);
        CPM_TABLE.put(23.0, 0.64065295);
        CPM_TABLE.put(23.5, 0.647576426);
        CPM_TABLE.put(24.0, 0.65443563);
        CPM_TABLE.put(24.5, 0.661214806);
        CPM_TABLE.put(25.0, 0.667934);
        CPM_TABLE.put(25.5, 0.674577537);
        CPM_TABLE.put(26.0, 0.68116492);
        CPM_TABLE.put(26.5, 0.687680648);
        CPM_TABLE.put(27.0, 0.69414365);
        CPM_TABLE.put(27.5, 0.700538673);
        CPM_TABLE.put(28.0, 0.70688421);
        CPM_TABLE.put(28.5, 0.713164996);
        CPM_TABLE.put(29.0, 0.71939909);
        CPM_TABLE.put(29.5, 0.725571552);
        CPM_TABLE.put(30.0, 0.7317);
        CPM_TABLE.put(30.5, 0.734741009);
        CPM_TABLE.put(31.0, 0.73776948);
        CPM_TABLE.put(31.5, 0.740785574);
        CPM_TABLE.put(32.0, 0.74378943);
        CPM_TABLE.put(32.5, 0.746781211);
        CPM_TABLE.put(33.0, 0.74976104);
        CPM_TABLE.put(33.5, 0.752729087);
        CPM_TABLE.put(34.0, 0.75568551);
        CPM_TABLE.put(34.5, 0.758630378);
        CPM_TABLE.put(35.0, 0.76156384);
        CPM_TABLE.put(35.5, 0.764486065);
        CPM_TABLE.put(36.0, 0.76739717);
        CPM_TABLE.put(36.5, 0.770297266);
        CPM_TABLE.put(37.0, 0.7731865);
        CPM_TABLE.put(37.5, 0.776064962);
        CPM_TABLE.put(38.0, 0.77893275);
        CPM_TABLE.put(38.5, 0.781790055);
        CPM_TABLE.put(39.0, 0.78463697);
        CPM_TABLE.put(39.5, 0.787473578);
        CPM_TABLE.put(40.0, 0.79030001);
    }

    public static double getCpm(double level) {
        return CPM_TABLE.get(level);
    }
}
