## Single Responsibility
---

>Objects or entities should be open for extension but closed for modification.

---
### Example explanation
In the incorrect folder, we have an insurance discount calculator class that has to determine the percentage of dicount for a customer. In the incorrect example, we have to modify InsuranceDiscountCalculator everytime we add a new type of customer. Doing this can cause us to add more bugs to the class which could cause downstream issues. This also violates the Open-Closed principle for the Insurance discount class. 

In the corrected folder, we have made the non-customer class classes implement the customer class. This allows mobile/home customer to still call the insurance discount calculator without having to modify the class for handling new types of customers. 