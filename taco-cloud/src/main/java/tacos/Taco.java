package tacos;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Data
public class Taco {

    @NotNull
    @Size(min=5,message = "Name must be at least 5 characters long")
    private  String name;

    @NotNull
    @Size(min=1, message = "You must choose at least 1 ingredient")
    private List<IngredientRef> ingredients = new ArrayList<>();
    private Long id;
    private Date createdAt = new Date();


}
