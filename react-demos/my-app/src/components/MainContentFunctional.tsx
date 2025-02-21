import React, { useEffect, useState } from 'react';
import { Employee } from '../types/Employee.type';

const MainContentFunctional: React.FC = () => {

    const [count, setCount] = useState(0);

    const [employees, setEmployees] = useState<Employee[]>([]);

    // useEffect(()=>{
    //     console.log('useEffect callback is executed!')
    //     //if no dependenices specified, then this callback will run after every render
    // });

    // useEffect(()=>{
    //     console.log('useEffect callback is executed!')
    //     //if empty dependenices specified as empty [], then this callback will run only once while mounting the component
    // }, []);

    // useEffect(()=>{
    //     console.log('useEffect callback is executed!')
    //     //if dependenices specified, then this callback will run every time the state of the given dependencies changes
    // }, [greeting]);

    useEffect(()=>{
        console.log('load the data from backend api')

        fetch('http://localhost:8081/api/employees')
            .then(response => response.json())
            .then((data: Employee[])=> {
                console.log('employee data received')
                console.log(data)
                setEmployees(data); //updating the component's state
            })
            .catch((error)=>{
                console.log('something went wrong')
                console.log(error)
            })
    }, []);

    return (
        <div>
            <h1>Employee List:</h1>
            <a href="/addemployee">Add a New Employee</a>
            {/* <h2>Count : {count}</h2>

            <button onClick={()=>setCount(count+1)} className="btn btn-primary">Increment</button>
            <hr /> */}

            <table className="table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>City</th>
                        <th>Email</th>
                        <th>Salary</th>
                    </tr>
                </thead> 
                <tbody>
                    {
                        employees.map((employee)=>{
                            return <tr key={employee.id}>
                                    <td>{employee.id}</td>
                                    <td>{employee.name}</td>
                                    <td>{employee.city}</td>
                                    <td>{employee.email}</td>
                                    <td>{employee.salary}</td>
                                </tr>     
                        })
                    }  
                </tbody>  
            </table>

        </div>
    );
};

export default MainContentFunctional;