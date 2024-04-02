package test.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data(staticConstructor= "category")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor

public class Category {
    private String id;
    private String name;


}
