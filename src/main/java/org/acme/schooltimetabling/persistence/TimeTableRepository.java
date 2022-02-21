package org.acme.schooltimetabling.persistence;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

import javax.enterprise.context.ApplicationScoped;

import org.acme.schooltimetabling.domain.Lesson;
import org.acme.schooltimetabling.domain.Room;
import org.acme.schooltimetabling.domain.TimeTable;
import org.acme.schooltimetabling.domain.Timeslot;

@ApplicationScoped
public class TimeTableRepository {

    private final AtomicReference<TimeTable> timeTableAtomicReference = new AtomicReference<>();

    public void save(Long problemId, TimeTable timeTable) {
        timeTableAtomicReference.set(timeTable);
    }

    public TimeTable load(Long problemId) {
        if (timeTableAtomicReference.get() == null) {
            AtomicLong nextId = new AtomicLong();
            List<Timeslot> timeslotList = new ArrayList<>();
            List<Room> roomList = new ArrayList<>();
            List<Lesson> lessonList = new ArrayList<>();

            roomList.add(new Room(nextId.incrementAndGet(), "Room A"));
            roomList.add(new Room(nextId.incrementAndGet(), "Room B"));
            roomList.add(new Room(nextId.incrementAndGet(), "Room C"));

            if (problemId % 3 == 0) {
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.MONDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.MONDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.MONDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.MONDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.MONDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));

                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.TUESDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.TUESDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.TUESDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.TUESDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.TUESDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));

                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physics", "M. Curie", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Chemistry", "M. Curie", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Biology", "C. Darwin", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "History", "I. Jones", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "I. Jones", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "I. Jones", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Spanish", "P. Cruz", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Spanish", "P. Cruz", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physics", "M. Curie", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Chemistry", "M. Curie", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "French", "M. Curie", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Geography", "C. Darwin", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "History", "I. Jones", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "P. Cruz", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Spanish", "P. Cruz", "10th grade"));
            } else if (problemId % 3 == 1) {
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.WEDNESDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.WEDNESDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.WEDNESDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.WEDNESDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.WEDNESDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.THURSDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.THURSDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.THURSDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.THURSDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.THURSDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.FRIDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.FRIDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.FRIDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.FRIDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.FRIDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));

                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "ICT", "A. Turing", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physics", "M. Curie", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Geography", "C. Darwin", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Geology", "C. Darwin", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "History", "I. Jones", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "I. Jones", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Drama", "I. Jones", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Art", "S. Dali", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Art", "S. Dali", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "9th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "ICT", "A. Turing", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physics", "M. Curie", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Biology", "C. Darwin", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Geology", "C. Darwin", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "History", "I. Jones", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "P. Cruz", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "P. Cruz", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Drama", "I. Jones", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Art", "S. Dali", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Art", "S. Dali", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "10th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "10th grade"));
            } else if (problemId % 3 == 2) {
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.MONDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.MONDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.MONDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.MONDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.MONDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.THURSDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.THURSDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.THURSDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.THURSDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.THURSDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.FRIDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.FRIDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.FRIDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.FRIDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotList.add(new Timeslot(nextId.incrementAndGet(), DayOfWeek.FRIDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));

                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "ICT", "A. Turing", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physics", "M. Curie", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Chemistry", "M. Curie", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "French", "M. Curie", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physics", "M. Curie", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Geography", "C. Darwin", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Biology", "C. Darwin", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Geology", "C. Darwin", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "History", "I. Jones", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "History", "I. Jones", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "P. Cruz", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "P. Cruz", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "P. Cruz", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Spanish", "P. Cruz", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Drama", "P. Cruz", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Art", "S. Dali", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Art", "S. Dali", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "11th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "11th grade"));

                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Math", "A. Turing", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "ICT", "A. Turing", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physics", "M. Curie", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Chemistry", "M. Curie", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "French", "M. Curie", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physics", "M. Curie", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Geography", "C. Darwin", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Biology", "C. Darwin", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Geology", "C. Darwin", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "History", "I. Jones", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "History", "I. Jones", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "P. Cruz", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "P. Cruz", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "English", "P. Cruz", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Spanish", "P. Cruz", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Drama", "P. Cruz", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Art", "S. Dali", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Art", "S. Dali", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "12th grade"));
                lessonList.add(new Lesson(nextId.incrementAndGet(), "Physical education", "C. Lewis", "12th grade"));
            }

            TimeTable timeTable = new TimeTable(timeslotList, roomList, lessonList);
            timeTableAtomicReference.set(timeTable);

        }
        return timeTableAtomicReference.get();
    }
}
