package b_immutable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString(includeFieldNames = false)
public final class Person {
    @Getter
    private final String name;
    @Getter
    private final String address;
}

