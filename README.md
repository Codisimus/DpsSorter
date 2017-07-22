# DpsSorter
Suggests the best set of Pokemon to use in Pokemon GO Raids best on your own Pokemon

## Concept
You provide this tool with information about your Pokemon. It then uses that information to decide which of your pokemon would be strongest against a defending Pokemon such as one in a gym or raid.

## Imperfections
This tool only cares about damage per second. This will let you know which of your Pokemon can do the most damage, quickly. In my experience, this is all that matters during raids, but that might not be the case if you have to spend time reviving your team.

This tool also doesn't account for dodging. Dodging gains energy towards your charge move so it has potential to affect DPS. This would be too hard to try to incorporate so the DPS calculations should be seen as estimants to give you a rough idea of how your Pokemon compare with each other.

Speaking of DPS, the output of this tool gives DPS. This is a raw value, during battle many more things factor into the DPS which will bring this down. Those include details of the defending Pokemon such as
* Species Base Defense
* Def IV

I have not considered these in the calculations because they won't affect the order of the list produced. Only the defending Pokemon's type truely matters. Whether the defending Pokemon is an Entei or a Charmander, the best possible team would be the same (when prioritizing DPS)

## Usage
### Setup
You must first input your Pokemon data into a CSV file
* The file must be named "pokemon.csv" and be within the same directory as _DpsSorter.jar_
* Each line within the CSV file is a new Pokemon
* Each Pokemon is entered with the following data:
  1. Species name in all caps i.e. GYARADOS
  2. Combat Power i.e. 2882
  3. Pokemon Level i.e. 30.5
  4. Atk IV i.e. 15
  5. Quick Move in all Caps/Underscores i.e. BITE
  6. Charge Move in all Caps/Underscores i.e. HYDRO_PUMP

Some Pokemon/Moves require specific entry names. I plan to make this smarter but until then you can find the exact names in Species.java, QuickMove.java, and ChargeMove.java.

The above pokemon would be entered as follows: `GYARADOS,2882,30.5,15,BITE,HYDRO_PUMP`

### Run
This program is run by executing the JAR file.

After being executed, if no errors occured, a file will be generated named _output.txt_.

### Output
The contents of this output file includes each Species that you may encounter and a list of your best Pokemon against that species. For each Species, the type is listed. Each listed Pokemon of yours includes the CP, and DPS. Occassionally, you will see _(no charge)_ appended to the end. This means that you should not use your charge move because it does less damage per second than your quick move. This is typically because of the type advantage/disadvantage of the moves.

### The Math
The following equations are used within this software:

![DPS = \frac{\frac{cm.energyCost}{qm.energyEarned} \times qm.adjustedPower + cm.adjustPower}{\frac{cm.energyCost}{qm.energyEarned} \times qm.cooldown + chargeTime} \times (baseAtk + atkIV)](https://github.com/Codisimus/DpsSorter/blob/master/PowerEqn.png?raw=true)

![adjustedPower = power \times STAB \times effectiveness1 \times effectiveness2](https://github.com/Codisimus/DpsSorter/blob/master/DPSEqn.png?raw=true)

Term              |Explanation
------------------|-------------------------------------------------
**qm**            |Quick Move
**ch**            |Charge Move
**STAB**          |1.2 if attacker species is same type as move, 1 otherwise
**effectiveness** |How effective a move type is against the defender species type - Super Effective (1.4), Not Very Effective (.714), Immune (.51), or Nuetral (1)
**effectiveness1**|Effectiveness of move against defender's 1st type
**effectiveness1**|Effectiveness of move against defender's 2nd type (or 1 if defender only has one type
**cooldown**      |Move cooldown in seconds
**chargeTime**    |0.5 amount of time in seconds it takes to launch charge move
**baseAtk**       |Species base power
**atkIV**         |Attack IV of the attacking Pokemon (0-15)

### TODO
I plan to add the following if this tool is well recieved:
* Javadocs
* Configuration to customize the output (which defending Pokemon to calculate for and how many of your own Pokemon to include in the list)
* GUI
* Android App
