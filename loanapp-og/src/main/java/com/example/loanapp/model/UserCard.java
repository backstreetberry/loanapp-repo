package com.example.loanapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_card_details")
public class UserCard {
	@Id
	@Column(name="row_id")
	private String row_id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="loan_id")
	private Loan loan;
	
	
	@Column(name="issue_date")
	private String issueDate;
}
