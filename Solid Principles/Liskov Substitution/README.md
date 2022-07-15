## Liskov Substitution
---

>Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.

---

### Example explanation

In the incorrect folder, we have a product utils class that adds some products to an array and then loops through them, applies a discount if necessary, and then prints the discount. The issue with this is that we are having to evaluate the class in the if statement to determine if the class needs to call extra functionality. We should never have to do this in our code due to the Liskov Substitution. In other words, we should be able to do all the same operations on all the product classes without having to worry about their class types.

In the correct folder, we have modified the HomePlus class to have an override method. this method is the same that is implemented in the insurance class. This allows us to remove the if statement from the product utils and continue to evaluate all the products. If the product class has a discount method, it will now be called the same way that insurance discounts are as well. 