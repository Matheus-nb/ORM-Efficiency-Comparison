import { Router } from "express"

import { EmployeesController } from './controllers/employeesController'
import { DepartmentsController } from "./controllers/departmentsController";
import {DeptEmpController} from "./controllers/deptEmpController";

const router = Router();

const employeesController = new EmployeesController();
const departmentsController = new DepartmentsController()
const deptEmpController = new DeptEmpController()



//Employees
router.post("/employees", employeesController.createEmployees);
router.post("/employees/insertAll", employeesController.createAllEmployees);

// Testes
router.get("/employees/:id", employeesController.getOneEmployee);
router.get("/employeesGreaterThan/:id", employeesController.getBigger);
router.get("/employeesOnDepartment", employeesController.getByDep);
router.get("/employeesOnDepartmentAndGreaterThan/:id", employeesController.getByDepAndId);
router.get("/employeesWithName", employeesController.getByName);
router.put("/employees/:id", employeesController.updateByIdRange);
router.delete("/employees", employeesController.deleteEmp);

// Departments
router.post("/departments", departmentsController.createDepartments);
router.post("/departments/insertAll", departmentsController.createAllDepartments);


// DeptEmp
router.post("/deptEmp", deptEmpController.createDeptEmp);
router.post("/deptEmp/insertAll", deptEmpController.createAllDeptEmp);


export { router }