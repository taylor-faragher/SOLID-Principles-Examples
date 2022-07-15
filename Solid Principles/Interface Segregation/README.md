## Interface Segregation
---

>A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.
---

### Example explanation
In the incorrect folder, we have a TMP customer class. This class is offers all the functionality that we offer for insurance customers. Next, we have a couple of interfaces that implement the TMP class. However, the interfaces may not have all the same features as TMP. The other classes have to override all the methods of the TMP customer class but we cannot implement code for all the features. This can become a problem if a future developer wants to call the unsupported method on a class thinking that it has code working behind it. This violates the Interface Segregation principle because we are forcing the mobile and insurance customers to implement functionality from TMP.

In the corrected version, we have broken out all the Asurion features into organized interfaces. Then, the different customer type interfaces just implement the interfaces of the features that they support. Now the TMP interface supports all the features and the other interfaces only support the functionality that is important to them.