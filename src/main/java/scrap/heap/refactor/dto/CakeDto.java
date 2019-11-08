package scrap.heap.refactor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CakeDto {
	String flavor;
	String frostingFlavor;
	String shape;
	String size;
	String color;

}
