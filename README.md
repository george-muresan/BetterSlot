# BetterSlot
Development of a comprehensive set of unit tests to verify a Slot Machine's correctness. In addition, another Slot Machine is provided with a better implementation of the rules. 



Each implementation of a Slot Machine is supposed to function according to the following rules:

A single play costs $2 and produces a set of five numbers taking values between 1 and 50 (inclusive) as uniformly-distributed, i.i.d. random variables.
Once the five number spin has been generated, an associated payoff is computed by applying the rules below.
Rules 1-5 are mutually-exclusive -- at most one of these rules may apply at a time, and each rule may apply exactly once per spin (choose the highest-paying rule which applies).
Rules 6-8 may apply in combination with any of rules 1-5 or with each other, but at most once per spin (each).
The payout rules are:

If all five numbers are the same, pay $1000000.
If four numbers are the same (and the fifth number does not match), pay $10000.
If three numbers are the same AND the remaining two numbers match each other (but not the previous three -- a "full house"), pay $5000.
If three numbers are the same and the remaining two numbers are different (both from the set of three and each other), pay $100
If any two numbers are the same (but no previous rule applies), pay $10.
Note that rule 5 is applied at most once per spin, even if the spin contains two distinct pairs of matching numbers.
If one or more of the five numbers is a perfect (integer) square, add $7 to the payout (at most once per spin).
If one or more of the five numbers is 42, add $2 (at most once per spin).
If one or more of the five numbers is a power of two, add $3 (at most once per spin).

