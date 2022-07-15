Single Responsibility

A class should have one and only one reason to change, meaning that a class should have only one job.

Example explanation
In the incorrect folder, we have a class for an Asurion customer that handles alot of methods for the customer. The class does everything from calculating discounts to saving customer info in a database. This violates the single responsibilty principle because the class is trying to do everything at once and therefore has to know information about all of the methods. This makes our class more complicated and opens it up to adding more bugs in the future.

In the corrected folder, the responsibilities for the customer class are broken out and separated into their own classes. Separating this logic helps us make the code more generic for handling more scenarios and cuts down the amount of bugs that can be introduced to a single class. 