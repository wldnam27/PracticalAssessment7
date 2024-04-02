package test.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor

public class Pet {
    private String id;
    private Category category; //ada id sama name
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private Status status;


}
