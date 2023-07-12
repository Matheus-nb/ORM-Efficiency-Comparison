
const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const createSalary = async (req, res) => {
  try {
    const { emp_no, salary, from_date, to_date } = req.body;

    const salaryCreated = await prisma.salary.create({
      data: {
        emp_no,
        salary,
        from_date,
        to_date,
      },
    });

    res.status(201).json(salaryCreated);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const deleteSalary = async (req, res) => {
  try {
    const { emp_no, from_date } = req.params;

    await prisma.salary.delete({
      where: {
        emp_no_from_date: {
          emp_no,
          from_date,
        },
      },
    });

    res.status(200).json({ message: 'Salary deleted successfully' });
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const updateSalary = async (req, res) => {
  try {
    const { emp_no, from_date } = req.params;
    const { salary, to_date } = req.body;

    const updatedSalary = await prisma.salary.update({
      where: {
        emp_no_from_date: {
          emp_no,
          from_date,
        },
      },
      data: {
        salary,
        to_date,
      },
    });

    res.status(200).json(updatedSalary);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

module.exports = {
  createSalary,
  deleteSalary,
  updateSalary,
};