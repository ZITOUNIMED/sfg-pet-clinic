package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseEntity implements Serializable{
	private Long id;
}
