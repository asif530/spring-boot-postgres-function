package com.example.demo.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "dataelk", schema = "tablefunction")
public class DataElk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "invoice_num")
    private Integer invoiceNumber;

    @Column(name = "invoice_date")
    private Timestamp invoiceDate;

    @Column(name = "year_month")
    private Integer yearMonth;

    @Column(name = "month")
    private Integer month;

    @Column(name = "day")
    private Integer day;

    @Column(name = "hour")
    private Integer hour;

    @Column(name = "stock_code")
    private String stockCode;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "unit_price")
    private Double unitPrice;

    @Column(name = "amount_spent")
    private Double amountSpent;

    @Column(name = "cust_id")
    private Integer customerId;

    @Column(name = "country")
    private String country;
}
