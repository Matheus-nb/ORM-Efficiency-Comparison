
const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const createDepartment = async (req, res) => {
  try {
    const { dept_no, dept_name } = req.body;

    const department = await prisma.department.create({
      data: {
        dept_no,
        dept_name,
      },
    });

    res.status(201).json(department);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const deleteDepartment = async (req, res) => {
  try {
    const { dept_no } = req.params;

    await prisma.department.delete({
      where: {
        dept_no,
      },
    });

    res.status(200).json({ message: 'Department deleted successfully' });
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const updateDepartment = async (req, res) => {
  try {
    const { dept_no } = req.params;
    const { dept_name } = req.body;

    const updatedDepartment = await prisma.department.update({
      where: {
        dept_no,
      },
      data: {
        dept_name,
      },
    });

    res.status(200).json(updatedDepartment);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

module.exports = {
  createDepartment,
  deleteDepartment,
  updateDepartment,
};