package dev.codecounty.oops.inheritance;

import java.util.Objects;

public class User {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        // Uses the same fields as equals() to generate the hash
        return Objects.hash(id, name);
    }
}