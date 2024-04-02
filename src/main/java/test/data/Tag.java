package test.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data(staticConstructor= "tags")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor

public class Tag {
    private String id;
    private String name;
}
