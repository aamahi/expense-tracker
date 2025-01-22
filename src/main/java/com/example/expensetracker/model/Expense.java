package com.example.expensetracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description; // Matches the "description" input
    private Double amount; // Matches the "amount" input
    private LocalDate date; // Matches the "date" input

    // Getters and Setters
}



