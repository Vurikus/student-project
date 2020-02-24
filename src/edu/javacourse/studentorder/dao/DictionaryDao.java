package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.PassportOffice;
import edu.javacourse.studentorder.domain.RegisterOffice;
import edu.javacourse.studentorder.domain.Street;
import edu.javacourse.studentorder.exception.DaoException;

import java.util.List;

public interface DictionaryDao
{
    List<Street> findStreet(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffice(String p_areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffice(String r_areaId) throws DaoException;
}
