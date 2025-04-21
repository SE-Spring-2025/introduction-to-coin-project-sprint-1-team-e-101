# Coins Project
## Sprint 1
### Sprint Goal
The goal of the sprint is to build working Coin, Demo, and test classes that shows the Coin is meeting customer requirements. And, as always, our code meets our corporate requirements: checkstyle, unit testing.
### Sprint tasks
1. Create appropriate folder structures
3. Write a CoinTest class that tests each method of the Coin class
2. Write a Coin class meeting customer requirements, passing tests, passing checkstyle
4. Write a Demo class that demonstrates our code (Coin class) satisfies customer requirements
### Domain details
Client wants to be able to create multiple coin objects of various value denominations. Most attributes are "built in" to the coin denomination; for example, images and mottos for coins are fixed. Consequently, constructor doesn't need many parameters and there should not be any way to change these attributes once they are set. (Coins don't change after construction!)

United States coins specifications are indicated in table below.
Familiar name | value | frontMotto | backMotto | frontLabel | backLabel | frontImage | backImage | valueDescription | ridged edge | metallurgy
--------------| ----- | ---------- | --------- | ---------- | --------- | ---------- | --------- | ---------------- | ----------- | ----------
Penny | 0.01 | "IN GOD WE TRUST" | "E PLURIBUS UNUM" | "LIBERTY" | "UNITED STATES OF AMERICA" | "A_Lincoln" | "Lincoln_Memorial" | "ONE CENT" | no | "Copper"
Nickel | 0.05 | "IN GOD WE TRUST" | "E PLURIBUS UNUM" | "LIBERTY" | "UNITED STATES OF AMERICA" | "T_Jefferson" | "Jefferson_Memorial" | "FIVE CENTS" | no | "Cupro-Nickel"
Dime | 0.10 | "IN GOD WE TRUST" | "E PLURIBUS UNUM" | "LIBERTY" | "UNITED STATES OF AMERICA" | "F_Roosevelt" | "Torch_Branches" | "ONE DIME" | yes | "Cupro-Nickel"
Quarter | 0.25 | "IN GOD WE TRUST" | "E PLURIBUS UNUM" | "LIBERTY" | "UNITED STATES OF AMERICA" | "G_Washington" | "Eagle" | "QUARTER DOLLAR" | yes | "Cupro-Nickel"
HalfDollar | 0.50 | "IN GOD WE TRUST" | "E PLURIBUS UNUM" | "LIBERTY" | "UNITED STATES OF AMERICA" | "J_Kennedy" | "Presidential_Seal" | "HALF DOLLAR" | yes | "Cupro-Nickel"
Dollar | 1.00 | "IN GOD WE TRUST" | "E PLURIBUS UNUM" | "LIBERTY" | "UNITED STATES OF AMERICA" | "S_Anthony" | "Moon_Eagle" | "ONE DOLLAR" | yes | "Cupro-Nickel"

### Implementation details
Our test classes and demo classes do not have to meet checkstyle or testing requirements. Only "production code" classes must meet those requirements.

We will separate the "main" code from the "test" code from the "demo" code with subfolders inside the src/ folder. For example, we will have    ```src/main/``` and ```src/demo/``` and ```src/test/``` folders.

See the docs/Coin-V1-Class.png image for a class diagram depicting the system.

