
const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const createManager = async (req, res) => {
  try {
    const { emp_no, dept_no, from_date, to_date } = req.body;

    const manager = await prisma.manager.create({
      data: {
        emp_no,
        dept_no,
        from_date,
        to_date,
      },
    });

    res.status(201).json(manager);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const deleteManager = async (req, res) => {
  try {
    const { emp_no, dept_no } = req.params;

    await prisma.manager.delete({
      where: {
        emp_no_dept_no: {
          emp_no,
          dept_no,
        },
      },
    });

    res.status(200).json({ message: 'Manager deleted successfully' });
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const updateManager = async (req, res) => {
  try {
    const { emp_no, dept_no } = req.params;
    const { from_date, to_date } = req.body;

    const updatedManager = await prisma.manager.update({
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

    res.status(200).json(updatedManager);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

module.exports = {
  createManager,
  deleteManager,
  updateManager,
};