# BirthdayPartyRefactory
Refactoring exercise

## Instructions
The purpose of this exercise is to improve the code so it is easier to work with. 
There are a few problems in there, find and fix what you can. Don't add any additional
functionality (unless you consider tests additional functionality), we're just checking to see how you can improve existing code.
 
## Getting Started

Running the application: `gradle build test run`

All output is written to the console.

## Issues
All code is in the main class. This makes it dificult to test unit test, there are no units. It makes difficult to extend functionality. Code would become difficult to read if more login were addded. It also mmakes the code impossable to re-use. The solutions si too break up code into smaller objects and services. I used lombok for getter/setters and builders.


## Output
 Task :run
balloon ordered; BalloonDto(color=red, material=mylar, number=4)
cake ordered; CakeDto(flavor=chocolate, frostingFlavor=chocolate, shape=circle, size=large, color=brown)
order results no. 1 status: true
balloon ordered; BalloonDto(color=blue, material=latex, number=7)
cake ordered; CakeDto(flavor=Vanilla, frostingFlavor=chocolate, shape=square, size=med, color=brown)
order results no. 2 status: true
balloon ordered; BalloonDto(color=yellow, material=mylar, number=4)
cake ordered; CakeDto(flavor=Vanilla, frostingFlavor=vanilla, shape=square, size=small, color=yellow)
order results no. 3 status: true
