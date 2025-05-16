package jp.co.sss.practice.p06.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruits_season")
public class FruitsSeason {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceGeneratorName")
	//@SequenceGenerator(sequenceName = "SequenceName", name = "SequenceGeneratorName", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fruit_gen")
	@SequenceGenerator(sequenceName = "seq_fruit", name = "seq_fruit_gen", allocationSize = 1)
	private Integer fruit_id;

	@Column
	private Integer fruit_name;

	@Column
	private Integer season_month;

}
