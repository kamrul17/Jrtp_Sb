package com.domorecode.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT_TABLE")
public class Student {
	@Id
private Integer id;
	@Column(name="student_name")
private String name;
	@Column(name="student_rank")
private Long  rank;
	@Column(name="student_gender")
private String gender;

	@Column(name="active_sw")
	private String activeSw;
	
//	TIMESTAMP 
	@CreationTimestamp()
	@Column(name="create_date",updatable = false)
private LocalDateTime createDate;
	@UpdateTimestamp
	@Column(name="update_date",insertable = false)
private LocalDateTime updateDate;
	
	
	
	
	public Student() {
		super();
	}
	
	public Student(Integer id, String name, Long rank, String gender, String activeSw) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
		this.activeSw = activeSw;
	}
	

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getRank() {
		return rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + ", createDate="
				+ createDate + ", updateDate=" + updateDate + "]";
	}
	

}
