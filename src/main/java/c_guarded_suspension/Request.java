package c_guarded_suspension;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString(includeFieldNames = false)
public class Request {
    @Getter
    private final String name;
}
