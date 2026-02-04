# The `equals()` and `hashCode()` Contract in Java

In Java, the relationship between `equals()` and `hashCode()` is foundational for the **Collections Framework**. If you override one, you **must** override the other to maintain the integrity of hashed data structures like `HashMap` and `HashSet`.

---

## 1. The Three Golden Rules
The contract defined in the `Object` class specifies:

* **Rule of Equality**: If $obj1.equals(obj2)$ is `true`, then $obj1.hashCode()$ **must** be equal to $obj2.hashCode()$.
* **Rule of Inequality**: If $obj1.equals(obj2)$ is `false`, the hashCodes **do not** have to be different. They can be the same as a hash collision. However, distinct hashCodes for unequal objects improve performance by reducing collisions.
* **Consistency**: If the fields used in the comparison haven't changed, `hashCode` must return the same integer throughout the object's lifetime.

---

## 2. Why is this necessary? (The Bucket Analogy)
Hashed collections use "buckets" to store data. When looking up an object, Java follows a two-step process:

1.  **`hashCode()`**: Determines the **bucket index**.
2.  **`equals()`**: Iterates through the objects in that specific bucket to find the **exact match**.



> [!CAUTION]
> **Breaking the Contract:**
> If two objects are equal but have different hash codes, they will end up in different buckets. The `Map` will fail to find your object even if it exists, leading to "disappearing" keys or duplicate entries in a `Set`.

---

## 3. Implementation Example

Using `java.util.Objects` is the recommended way to implement this in modern Java (Java 7+):

```java
@Override
public boolean equals(Object o) {
    // 1. Reference check
    if (this == o) return true;
    
    // 2. Null and Type check
    if (o == null || getClass() != o.getClass()) return false;
    
    // 3. Cast and field comparison
    User user = (User) o;
    return id == user.id && 
           Objects.equals(name, user.name);
}

@Override
public int hashCode() {
    // Must use the same fields as equals() to generate the hash
    return Objects.hash(id, name);
}