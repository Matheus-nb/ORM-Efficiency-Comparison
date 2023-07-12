const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const createTitle = async (req, res) => {
  try {
    const { emp_no, title, from_date, to_date } = req.body;

    const titleCreated = await prisma.title.create({
      data: {
        emp_no,
        title,
        from_date,
        to_date,
      },
    });

    res.status(201).json(titleCreated);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const deleteTitle = async (req, res) => {
  try {
    const { emp_no, title, from_date } = req.params;

    await prisma.title.delete({
      where: {
        emp_no_title_from_date: {
          emp_no,
          title,
          from_date,
        },
      },
    });

    res.status(200).json({ message: 'Title deleted successfully' });
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

const updateTitle = async (req, res) => {
  try {
    const { emp_no, title, from_date } = req.params;
    const { to_date } = req.body;

    const updatedTitle = await prisma.title.update({
      where: {
        emp_no_title_from_date: {
          emp_no,
          title,
          from_date,
        },
      },
      data: {
        to_date,
      },
    });

    res.status(200).json(updatedTitle);
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: 'Internal Server Error' });
  }
};

module.exports = {
  createTitle,
  deleteTitle,
  updateTitle,
};