/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.demo.example.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Student service. Represents a row in the &quot;HEADLESS_Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.demo.example.model.impl.StudentModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.demo.example.model.impl.StudentImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
@ProviderType
public interface StudentModel extends BaseModel<Student> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a student model instance should use the {@link Student} interface instead.
	 */

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this student.
	 *
	 * @return the ID of this student
	 */
	public long getId();

	/**
	 * Sets the ID of this student.
	 *
	 * @param id the ID of this student
	 */
	public void setId(long id);

	/**
	 * Returns the name of this student.
	 *
	 * @return the name of this student
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this student.
	 *
	 * @param name the name of this student
	 */
	public void setName(String name);

	/**
	 * Returns the standard of this student.
	 *
	 * @return the standard of this student
	 */
	@AutoEscape
	public String getStandard();

	/**
	 * Sets the standard of this student.
	 *
	 * @param standard the standard of this student
	 */
	public void setStandard(String standard);

	@Override
	public Student cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}