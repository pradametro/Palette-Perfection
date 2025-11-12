# Palette-Perfection 🎨
A simple Java Swing app that helps users estimate paint needed and total cost for a room. Users can choose a regular (rectangular) room or an irregular room (four wall segments), enter dimensions, and instantly get gallons required and price. Presented using JOptionPane.

The program interacts with users through pop-up dialog boxes using JOptionPane, and supports both regular (rectangular) and irregular room shapes.


⚙️ **Features**

- Welcomes the user by name and provides a friendly, interactive experience.

- Allows users to select between regular and irregular room shapes.

- Prompts for dimensions (length, width, height, etc.) and validates inputs to ensure only positive values are accepted.

- Calculates the total surface area of the walls to be painted.

- Estimates the amount of paint (in gallons) needed and the total cost based on a fixed price per gallon.

- Displays a formatted report summarizing the surface area, paint required, and total price.

- Ends with a personalized thank-you message.



Example Calculation
- User enters their name and selects the room shape.

- Enters room dimensions.

- Program calculates:

  - surfaceArea

  - gallonsNeeded = Math.ceil(surfaceArea / 350)

  - totalPrice = gallonsNeeded * 53.35
- A final message displays the results neatly formatted.
