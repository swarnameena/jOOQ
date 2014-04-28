/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schemata extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 547175580;

	/**
	 * The singleton instance of <code>information_schema.schemata</code>
	 */
	public static final org.jooq.util.postgres.information_schema.tables.Schemata SCHEMATA = new org.jooq.util.postgres.information_schema.tables.Schemata();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>information_schema.schemata.catalog_name</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CATALOG_NAME = createField("catalog_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.schema_name</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.schema_owner</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_OWNER = createField("schema_owner", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.default_character_set_catalog</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFAULT_CHARACTER_SET_CATALOG = createField("default_character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.default_character_set_schema</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFAULT_CHARACTER_SET_SCHEMA = createField("default_character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.default_character_set_name</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFAULT_CHARACTER_SET_NAME = createField("default_character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.sql_path</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SQL_PATH = createField("sql_path", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>information_schema.schemata</code> table reference
	 */
	public Schemata() {
		this("schemata", null);
	}

	/**
	 * Create an aliased <code>information_schema.schemata</code> table reference
	 */
	public Schemata(java.lang.String alias) {
		this(alias, org.jooq.util.postgres.information_schema.tables.Schemata.SCHEMATA);
	}

	private Schemata(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private Schemata(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.postgres.information_schema.tables.Schemata as(java.lang.String alias) {
		return new org.jooq.util.postgres.information_schema.tables.Schemata(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.util.postgres.information_schema.tables.Schemata rename(java.lang.String name) {
		return new org.jooq.util.postgres.information_schema.tables.Schemata(name, null);
	}
}
