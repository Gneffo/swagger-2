package co.develhope.swagger2.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArithmeticOperation {
    @Schema(description = "The name of the arithmetic operation", example = "Addition")
    private String name;
    @Schema(description = "Minimum number of operands that are necessary to computer the operation ", example = "2")
    private int minNumberOfOperands;
    @Schema(description = "The description of the operation", example = "addend + addend = sum")
    private String description;
    @Schema(description = "A list of properties of the specific operation", example = "['Anti-commutativity', 'Non-associativity', 'Predecessor']")
    private String[] properties;


}
