# JETS APPLICATION

### HOW IT WORKS
Right now the app currently works to the guidelines provided. It creates an
instance of JetsApp and then calls JetApp's method launch. This creates a new
airfield then we read in a list of planes using AirField's method createListOfJets.

We open a scanner, start our loop and print the menu. We take the user's input
from the menu, pass it to a switch(case) which executes the proper task and returns
the user to the main menu.

I've implemented five platforms of jets, spy jets, satellite jets, cargo jets,
attack jets, and fighter jets, as well as a class to implement custom user created
jets. Each of the five jets is assigned an object from the text file. I assumed
since I had knowledge of the format of the information in the txt file that the
way I created the objects here is acceptable.

### WHAT I USED
Honestly the concepts I used here are pretty straight forward. I kept waiting for
the moment where I would have to do something crazy like nested arrays, but it
never happened. The most challenging part for me was reading in the data from
the txt file and assigning the data to objects.

Other than that the menu is controlled by a method printing the text, a while loop
controlling bulk of the code and a switch(case) controlling the outcome based on
the input. The way I assigned the objects was also through a switch case, again
since I knew how the info would be formatted.

### WHAT I LEARNED
Class management was my main take away here. Trying to figure out imports and
declarations, how and where I could call objects' methods, things like that
were the best lessons.

### WHAT I NEED TO LEARN
My understanding of collections in general is pretty tenuous at the moment. I wish
I'd had the time to try and implement an interface as well. I think if I understood
printf better as well it would've made the formatting for the string output much
easier and less time consuming. I felt like I really stuck to the concepts I felt
a bit more comfortable with on this project and I'd like to push myself towards more
uncomfortable concepts on projects moving forward.
