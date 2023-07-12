import {Request, Response} from "express";

const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

export class DepartmentsController {
  async createDepartments(req: Request, res: Response) {
    try {
      const { dept_no, dept_name } = req.body;

      const department = await prisma.department.create({
        data: {
          dept_no,
          dept_name,
        }
      });

      res.status(201).json(department);

    } catch (error) {
      console.error(error);
      res.status(500).json({ error: 'Internal Server Error' });
    }
  };

  async createAllDepartments(req: Request, res: Response) {
    try {
      const result = await prisma.$queryRaw`INSERT INTO department VALUES
('d001','Marketing'),
('d002','Finance'),
('d003','Human Resources'),
('d004','Production'),
('d005','Development'),
('d006','Quality Management'),
('d007','Sales'),
('d008','Research'),
('d009','Customer Service');`

      res.status(201).json(result)

    } catch (error) {
      console.error(error);
      res.status(500).json({ error: 'Internal Server Error' });
    }
  };
}