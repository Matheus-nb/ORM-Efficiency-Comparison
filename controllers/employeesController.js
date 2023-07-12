const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const createEmployee = async (req, res) => {
  try {
    const { emp_no, birth_date, first_name, last_name, gender, hire_date } = req.body;

    const employee = await prisma.employee.create({
      data: {
        emp_no,
        birth_date,
        first_name,
        last_name,
        gender,
        hire_date,
      },
    });

    res.status(201).json(employee);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const deleteEmployee = async (req, res) => {
  try {
    const { emp_no } = req.params;

    await prisma.employee.delete({
      where: {
        emp_no,
      },
    });

    res.status(200).json({ message: 'Employee deleted successfully' });
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const updateEmployee = async (req, res) => {
  try {
    const { emp_no } = req.params;
    const { birth_date, first_name, last_name, gender, hire_date } = req.body;

    const updatedEmployee = await prisma.employee.update({
      where: {
        emp_no,
      },
      data: {
        birth_date,
        first_name,
        last_name,
        gender,
        hire_date,
      },
    });

    res.status(200).json(updatedEmployee);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

module.exports = {
  createEmployee,
  deleteEmployee,
  updateEmployee,
};