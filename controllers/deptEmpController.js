const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const createDeptEmp = async (req, res) => {
  try {
    const { emp_no, dept_no, from_date, to_date } = req.body;

    const deptEmp = await prisma.deptEmp.create({
      data: {
        emp_no,
        dept_no,
        from_date,
        to_date,
      },
    });

    res.status(201).json(deptEmp);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const deleteDeptEmp = async (req, res) => {
  try {
    const { emp_no, dept_no } = req.params;

    await prisma.deptEmp.delete({
      where: {
        emp_no_dept_no: {
          emp_no,
          dept_no,
        },
      },
    });

    res.status(200).json({ message: 'Department Employee deleted successfully' });
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const updateDeptEmp = async (req, res) => {
  try {
    const { emp_no, dept_no } = req.params;
    const { from_date, to_date } = req.body;

    const updatedDeptEmp = await prisma.deptEmp.update({
      where: {
        emp_no_dept_no: {
          emp_no,
          dept_no,
        },
      },
      data: {
        from_date,
        to_date,
      },
    });

    res.status(200).json(updatedDeptEmp);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

module.exports = {
  createDeptEmp,
  deleteDeptEmp,
  updateDeptEmp,
};