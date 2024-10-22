package com.demo.student.internal.resource.v1_0;



import com.demo.example.model.Student;
import com.demo.example.service.StudentLocalServiceUtil;

import com.demo.student.resource.v1_0.StudentResource;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;


import java.util.List;

import javax.validation.Valid;
import javax.validation.executable.ValidateOnExecution;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author ADMIN
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/student.properties",
	scope = ServiceScope.PROTOTYPE, service = StudentResource.class
)
public class StudentResourceImpl extends BaseStudentResourceImpl{
	
	@Override
	public Student getStudent() throws Exception {
		
		List<Student> studentEntity = studentLocalServiceUtil.getStudents(-1, -1);
		JSONObject studentObject = JSONFactoryUtil.createJSONObject();
		JSONArray dataObject = JSONFactoryUtil.createJSONArray();
		
		for(Student  entry : studentEntity) {
			JSONObject studentSingleObject = JSONFactoryUtil.createJSONObject();
			studentSingleObject.put("id", entry.getId());
			studentSingleObject.put("name", entry.getName());
			studentSingleObject.put("standard", entry.getStandard());
			dataObject.put(studentSingleObject);
		}
		
		studentObject.put("data",dataObject);
		studentObject.put("message","Student data listing successfully");
		
		return  _commonResponse(studentObject);
	}
	
	protected Student _commonResponse(JSONObject studentObject) throws Exception{
		return new Student() {{
			data = studentObject.get("data");
			message = studentObject.get("message");
		}};
	}
	 
	@Autowired
	private Student student;
	
	@Autowired
	private StudentLocalServiceUtil studentLocalServiceUtil;
	
	
}