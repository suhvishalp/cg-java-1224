import React from 'react';
import { SubmitHandler, useForm } from 'react-hook-form';
import { Employee } from '../types/Employee.type';


//create a type to represent the captured form data

const CreateEmployeeForm = () => {

    const {register, handleSubmit, watch, formState: { errors }} =  useForm<Employee>();

    const onSubmit:SubmitHandler<Employee> = async (data) => {
        console.log('form is submitted')
        console.log('data :', data)

          const response =  await fetch('http://localhost:8081/api/employees', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)
          })

          if(!response.ok)
            throw new Error('something weng wrong')

          const responseData  = await response.json()  
          console.log('Employee is created Successfully')
    }

    return (
        <div className='container'>
            <h1>Create a new Employee</h1>
            <form onSubmit={ handleSubmit(onSubmit) }>

            <div className="mb-3">
                <label htmlFor="empName" className="form-label">Employee Name</label>
                <input type="text" 
                        className="form-control" 
                        id="empName"
                        {...register("name", { 
                            required :"Name is required Field",
                            minLength: {
                                value: 3,
                                message: "Length of name must be at least 3 characters"
                            }
                        })
                        } />
                { errors.name && <span className='errormessage'>{errors.name?.message}</span> }
            </div>

            <div className="mb-3">
                <label htmlFor="email" className="form-label">Email</label>
                <input type="email" 
                        className="form-control" 
                        id="email"
                        {...register("email")} />
            </div>

            <div className="mb-3">
                <label htmlFor="city" className="form-label">City</label>
                <input type="text" 
                        className="form-control" 
                        id="city" 
                        {...register("city")}/>
            </div>

            <div className="mb-3">
                <label htmlFor="salary" className="form-label">Salary</label>
                <input type="text" 
                        className="form-control" 
                        id="salary"
                        {...register("salary")} />
            </div>

            <input type="submit" className='btn btn-primary' value="Create Employee" />

            </form>
        </div>
    );
};

export default CreateEmployeeForm;