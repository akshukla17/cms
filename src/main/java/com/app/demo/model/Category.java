package com.app.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@Column(name = "category_id")
	private String categoryId;

	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "catalog_id")
	private String catalogId;
	
	@Column(name = "category_type")
	private String categoryType;
	
	@Column(name = "parent_cat_id")
	private String parentCategoryId;
	
	@Column(name = "long_description")
	private String longDescription;
	
	@Column(name = "creation_date")
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	
	@Column(nullable = false,name = "root_category")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isRootCategory;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getParentCategoryId() {
		return parentCategoryId;
	}

	public void setParentCategoryId(String parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public boolean isRootCategory() {
		return isRootCategory;
	}

	public void setRootCategory(boolean isRootCategory) {
		this.isRootCategory = isRootCategory;
	}

}
