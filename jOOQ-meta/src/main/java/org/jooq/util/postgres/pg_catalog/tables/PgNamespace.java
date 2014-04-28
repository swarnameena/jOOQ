/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgNamespace extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1676093965;

	/**
	 * The singleton instance of <code>pg_catalog.pg_namespace</code>
	 */
	public static final org.jooq.util.postgres.pg_catalog.tables.PgNamespace PG_NAMESPACE = new org.jooq.util.postgres.pg_catalog.tables.PgNamespace();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_namespace.nspname</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NSPNAME = createField("nspname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_namespace.nspowner</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NSPOWNER = createField("nspowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_namespace.nspacl</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String[]> NSPACL = createField("nspacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * Create a <code>pg_catalog.pg_namespace</code> table reference
	 */
	public PgNamespace() {
		this("pg_namespace", null);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_namespace</code> table reference
	 */
	public PgNamespace(java.lang.String alias) {
		this(alias, org.jooq.util.postgres.pg_catalog.tables.PgNamespace.PG_NAMESPACE);
	}

	private PgNamespace(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private PgNamespace(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.postgres.pg_catalog.tables.PgNamespace as(java.lang.String alias) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgNamespace(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.util.postgres.pg_catalog.tables.PgNamespace rename(java.lang.String name) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgNamespace(name, null);
	}
}
