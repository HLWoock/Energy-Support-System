package de.woock.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@Entity
public class SystemInfo extends DomainObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String system;
	String hostName;
	String host;
	String ip;
	
	int Processors;
	long freeMem;
	long maxMem;
	long totalMem; 
	
	String javaVersion;
	
	
}
