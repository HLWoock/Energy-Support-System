package de.woock.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EnergyMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String message;
}
