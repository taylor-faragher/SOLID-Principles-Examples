## Dependency Inversion
---

> Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.

---
### Example explanation
In the incorrect folder, we have a Product list class that has a dependency on the DatabaseProductRepository. However, the ProductList should not care about anything with the product database or how it is used or implemented. However, if you wanted to make a change to the database code, you would also have to change the product list code as well (this also violates open-close).

Instead, in the correct folder, we have created a factory class for the DatabaseProductRepository and used that to created an abstraction of the service in the ProductList. This now means that Product List does not have to be changed if the database code changes.