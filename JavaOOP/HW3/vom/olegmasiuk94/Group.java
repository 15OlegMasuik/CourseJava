package vom.olegmasiuk94;

/**
 * Created by Marta on 27.11.2017.
 */
public class Group {
    final private int size = 10;
    public Students[] group = new Students[size];

    public Group() {
    }

    public void addStudents(Students newStudents) throws GroupeExseption {
        if (newStudents != null) {

            for (int i = 0; i < group.length; i++) {
                if (group[i] == null) {
                    group[i] = newStudents;
                    return;
                }
            }
            throw new GroupeExseption();
        } else {
            System.err.println("Group is empy((");
        }
    }

    public boolean deleteStudents(Students newStudens) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == newStudens) {
                group[i] = null;
                return true;
            }
        }

        return false;
    }

    public Students serchStudents(String surname) {
        for (int i = 0; i < group.length; i++) {
            if ((group[i] != null) && group[i].getSecondname() != null&& group[i].getSecondname().equalsIgnoreCase(surname)) {
                return group[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                sb.append(group[i].toString()+System.lineSeparator());
            }

        }

        return "Group: " + sb.toString();
    }


}
