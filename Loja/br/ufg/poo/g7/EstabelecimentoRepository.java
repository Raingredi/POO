package br.ufg.poo.g7;

import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import com.j256.ormlite.table.TableUtils;
import java.util.List;
import java.util.ArrayList;

public class EstabelecimentoRepository {
    private static Database database;
    private static Dao<Estabelecimento, Integer> dao;
    private List<Estabelecimento> loadedEstabelecimentos;

    public EstabelecimentoRepository(Database database) {
        EstabelecimentoRepository.setDatabase(database);
        loadedEstabelecimentos = new ArrayList<Estabelecimento>();
    }

    public static void setDatabase(Database database) {
        EstabelecimentoRepository.database = database;
        try {
            dao = DaoManager.createDao(database.getConnection(), Estabelecimento.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Estabelecimento.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Estabelecimento create(Estabelecimento estabelecimento) {
        int nrows = 0;
        try {
            nrows = dao.create(estabelecimento);
            if (nrows == 0)
                throw new SQLException("Error: object not saved");
            loadedEstabelecimentos.add(estabelecimento);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return estabelecimento;
    }

    public void update(Estabelecimento estabelecimento) {
        try {
            dao.update(estabelecimento);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(Estabelecimento estabelecimento) {
        try {
            dao.delete(estabelecimento);
            loadedEstabelecimentos.remove(estabelecimento);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Estabelecimento loadFromId(int id) {
        Estabelecimento estabelecimento = null;
        try {
            estabelecimento = dao.queryForId(id);
            if (estabelecimento != null)
                loadedEstabelecimentos.add(estabelecimento);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return estabelecimento;
    }

    public List<Estabelecimento> loadAll() {
        try {
            loadedEstabelecimentos = dao.queryForAll();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return loadedEstabelecimentos;
    }

    public static Database getDatabase() {
        return database;
    }

    public static Dao<Estabelecimento, Integer> getDao() {
        return dao;
    }

    public static void setDao(Dao<Estabelecimento, Integer> dao) {
        EstabelecimentoRepository.dao = dao;
    }

    public List<Estabelecimento> getLoadedEstabelecimentos() {
        return loadedEstabelecimentos;
    }

    public void setLoadedEstabelecimentos(List<Estabelecimento> loadedEstabelecimentos) {
        this.loadedEstabelecimentos = loadedEstabelecimentos;
    }
}
