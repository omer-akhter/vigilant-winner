some answers are given below. other answers have been demonstrated in the code.

question 1
==========

a. unit tests
-------------

i added test for each concrete class and tested each of the behavior

b. maintainability
------------------

* text book answers include
  * avoid coupling making it easy to change.
  * code comments. though, I believe writing simple self-explaining code is more affective; commenting where needed.
  * unit tests. changes may break the code and with good unit tests, we can save lot of time.
  * DRY (Don't Repeat Yourself). so the change is at single place and easy. this is my personal favorite.

* my experience
  * get the requirements crystal and clear. ask more questions. share user stories and get feedback. so on. investing more time understanding requirements saves trouble and time many a fold.
  * plan! we need to see the whole picture and also see the future. then architect the system. it should be an extensible and flexible design. rushing to code is bad practice and so is short-sightedness.
  * prototype. get feedback. repeat.

question 2
==========

b. rooster chicken relation
---------------------------

current solution has only one class implementing both. this could, however, be implemented in 2 (Chicken and Rooster) or 3 classes (ChickenRoosterBase). in either case, they would have been on same level inheriting from same parent.

c. rooster without inheritance
------------------------------

current solution has only one class implementing both.

question 4
==========

d. parrot maintainability
------------------------

parrot constructor accepts an argument which allows for specification of sound it may imitate. thus the code for parrot is quite concise and maintainable.
