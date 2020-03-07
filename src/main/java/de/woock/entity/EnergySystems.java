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
public class EnergySystems extends DomainObject implements Serializable{

	private static final long serialVersionUID = 1L;
	long live_support;
	long wappons;
	long navigation;
	long warp_drive;
	long shields;
}
