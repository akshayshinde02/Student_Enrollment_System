package com.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.provider.FactoryProvider;

public class Update {

    public void updateEmployee(int id, Student updatedStudent) {
        Session session = FactoryProvider.getFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Fetch the employee to be updated by ID
        Student employee = session.get(Student.class, id);

        if (employee != null) {
            // Update only the properties that have non-null values in the updatedStudent object
            if (updatedStudent.getRollNo() != 0) {
                employee.setRollNo(updatedStudent.getRollNo());
            }
            if (updatedStudent.getFullName() != null) {
                employee.setFullName(updatedStudent.getFullName());
            }
            if (updatedStudent.getClassName() != null) {
                employee.setClassName(updatedStudent.getClassName());
            }
            if (updatedStudent.getBirthDate() != null) {
                employee.setBirthDate(updatedStudent.getBirthDate());
            }
            if (updatedStudent.getAddress() != null) {
                employee.setAddress(updatedStudent.getAddress());
            }
            if (updatedStudent.getEnrollmentDate() != null) {
                employee.setEnrollmentDate(updatedStudent.getEnrollmentDate());
            }
          

            // Save or update the entity back to the database
            session.saveOrUpdate(employee);

            transaction.commit();
        }

        session.close(); // Close the session after transaction
    }
}
