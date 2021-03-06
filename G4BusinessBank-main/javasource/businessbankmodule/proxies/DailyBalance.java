// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package businessbankmodule.proxies;

public class DailyBalance
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dailyBalanceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BusinessBankModule.DailyBalance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		turnoverDate("turnoverDate"),
		previousBalance("previousBalance"),
		turnoverInFavor("turnoverInFavor"),
		turnoverInExpense("turnoverInExpense"),
		newBalance("newBalance"),
		dailyBalanceAccount("BusinessBankModule.dailyBalanceAccount"),
		paymentOrderDailyBalance("BusinessBankModule.paymentOrderDailyBalance");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DailyBalance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BusinessBankModule.DailyBalance"));
	}

	protected DailyBalance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dailyBalanceMendixObject)
	{
		if (dailyBalanceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("BusinessBankModule.DailyBalance", dailyBalanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BusinessBankModule.DailyBalance");

		this.dailyBalanceMendixObject = dailyBalanceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DailyBalance.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static businessbankmodule.proxies.DailyBalance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return businessbankmodule.proxies.DailyBalance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static businessbankmodule.proxies.DailyBalance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new businessbankmodule.proxies.DailyBalance(context, mendixObject);
	}

	public static businessbankmodule.proxies.DailyBalance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return businessbankmodule.proxies.DailyBalance.initialize(context, mendixObject);
	}

	public static java.util.List<businessbankmodule.proxies.DailyBalance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<businessbankmodule.proxies.DailyBalance> result = new java.util.ArrayList<businessbankmodule.proxies.DailyBalance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//BusinessBankModule.DailyBalance" + xpathConstraint))
			result.add(businessbankmodule.proxies.DailyBalance.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of turnoverDate
	 */
	public final java.util.Date getturnoverDate()
	{
		return getturnoverDate(getContext());
	}

	/**
	 * @param context
	 * @return value of turnoverDate
	 */
	public final java.util.Date getturnoverDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.turnoverDate.toString());
	}

	/**
	 * Set value of turnoverDate
	 * @param turnoverdate
	 */
	public final void setturnoverDate(java.util.Date turnoverdate)
	{
		setturnoverDate(getContext(), turnoverdate);
	}

	/**
	 * Set value of turnoverDate
	 * @param context
	 * @param turnoverdate
	 */
	public final void setturnoverDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date turnoverdate)
	{
		getMendixObject().setValue(context, MemberNames.turnoverDate.toString(), turnoverdate);
	}

	/**
	 * @return value of previousBalance
	 */
	public final java.math.BigDecimal getpreviousBalance()
	{
		return getpreviousBalance(getContext());
	}

	/**
	 * @param context
	 * @return value of previousBalance
	 */
	public final java.math.BigDecimal getpreviousBalance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.previousBalance.toString());
	}

	/**
	 * Set value of previousBalance
	 * @param previousbalance
	 */
	public final void setpreviousBalance(java.math.BigDecimal previousbalance)
	{
		setpreviousBalance(getContext(), previousbalance);
	}

	/**
	 * Set value of previousBalance
	 * @param context
	 * @param previousbalance
	 */
	public final void setpreviousBalance(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal previousbalance)
	{
		getMendixObject().setValue(context, MemberNames.previousBalance.toString(), previousbalance);
	}

	/**
	 * @return value of turnoverInFavor
	 */
	public final java.math.BigDecimal getturnoverInFavor()
	{
		return getturnoverInFavor(getContext());
	}

	/**
	 * @param context
	 * @return value of turnoverInFavor
	 */
	public final java.math.BigDecimal getturnoverInFavor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.turnoverInFavor.toString());
	}

	/**
	 * Set value of turnoverInFavor
	 * @param turnoverinfavor
	 */
	public final void setturnoverInFavor(java.math.BigDecimal turnoverinfavor)
	{
		setturnoverInFavor(getContext(), turnoverinfavor);
	}

	/**
	 * Set value of turnoverInFavor
	 * @param context
	 * @param turnoverinfavor
	 */
	public final void setturnoverInFavor(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal turnoverinfavor)
	{
		getMendixObject().setValue(context, MemberNames.turnoverInFavor.toString(), turnoverinfavor);
	}

	/**
	 * @return value of turnoverInExpense
	 */
	public final java.math.BigDecimal getturnoverInExpense()
	{
		return getturnoverInExpense(getContext());
	}

	/**
	 * @param context
	 * @return value of turnoverInExpense
	 */
	public final java.math.BigDecimal getturnoverInExpense(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.turnoverInExpense.toString());
	}

	/**
	 * Set value of turnoverInExpense
	 * @param turnoverinexpense
	 */
	public final void setturnoverInExpense(java.math.BigDecimal turnoverinexpense)
	{
		setturnoverInExpense(getContext(), turnoverinexpense);
	}

	/**
	 * Set value of turnoverInExpense
	 * @param context
	 * @param turnoverinexpense
	 */
	public final void setturnoverInExpense(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal turnoverinexpense)
	{
		getMendixObject().setValue(context, MemberNames.turnoverInExpense.toString(), turnoverinexpense);
	}

	/**
	 * @return value of newBalance
	 */
	public final java.math.BigDecimal getnewBalance()
	{
		return getnewBalance(getContext());
	}

	/**
	 * @param context
	 * @return value of newBalance
	 */
	public final java.math.BigDecimal getnewBalance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.newBalance.toString());
	}

	/**
	 * Set value of newBalance
	 * @param newbalance
	 */
	public final void setnewBalance(java.math.BigDecimal newbalance)
	{
		setnewBalance(getContext(), newbalance);
	}

	/**
	 * Set value of newBalance
	 * @param context
	 * @param newbalance
	 */
	public final void setnewBalance(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal newbalance)
	{
		getMendixObject().setValue(context, MemberNames.newBalance.toString(), newbalance);
	}

	/**
	 * @return value of dailyBalanceAccount
	 */
	public final businessbankmodule.proxies.Account getdailyBalanceAccount() throws com.mendix.core.CoreException
	{
		return getdailyBalanceAccount(getContext());
	}

	/**
	 * @param context
	 * @return value of dailyBalanceAccount
	 */
	public final businessbankmodule.proxies.Account getdailyBalanceAccount(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		businessbankmodule.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.dailyBalanceAccount.toString());
		if (identifier != null)
			result = businessbankmodule.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of dailyBalanceAccount
	 * @param dailybalanceaccount
	 */
	public final void setdailyBalanceAccount(businessbankmodule.proxies.Account dailybalanceaccount)
	{
		setdailyBalanceAccount(getContext(), dailybalanceaccount);
	}

	/**
	 * Set value of dailyBalanceAccount
	 * @param context
	 * @param dailybalanceaccount
	 */
	public final void setdailyBalanceAccount(com.mendix.systemwideinterfaces.core.IContext context, businessbankmodule.proxies.Account dailybalanceaccount)
	{
		if (dailybalanceaccount == null)
			getMendixObject().setValue(context, MemberNames.dailyBalanceAccount.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.dailyBalanceAccount.toString(), dailybalanceaccount.getMendixObject().getId());
	}

	/**
	 * @return value of paymentOrderDailyBalance
	 */
	public final java.util.List<businessbankmodule.proxies.PaymentOrder> getpaymentOrderDailyBalance() throws com.mendix.core.CoreException
	{
		return getpaymentOrderDailyBalance(getContext());
	}

	/**
	 * @param context
	 * @return value of paymentOrderDailyBalance
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<businessbankmodule.proxies.PaymentOrder> getpaymentOrderDailyBalance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<businessbankmodule.proxies.PaymentOrder> result = new java.util.ArrayList<businessbankmodule.proxies.PaymentOrder>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.paymentOrderDailyBalance.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(businessbankmodule.proxies.PaymentOrder.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of paymentOrderDailyBalance
	 * @param paymentorderdailybalance
	 */
	public final void setpaymentOrderDailyBalance(java.util.List<businessbankmodule.proxies.PaymentOrder> paymentorderdailybalance)
	{
		setpaymentOrderDailyBalance(getContext(), paymentorderdailybalance);
	}

	/**
	 * Set value of paymentOrderDailyBalance
	 * @param context
	 * @param paymentorderdailybalance
	 */
	public final void setpaymentOrderDailyBalance(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<businessbankmodule.proxies.PaymentOrder> paymentorderdailybalance)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (businessbankmodule.proxies.PaymentOrder proxyObject : paymentorderdailybalance)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.paymentOrderDailyBalance.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dailyBalanceMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final businessbankmodule.proxies.DailyBalance that = (businessbankmodule.proxies.DailyBalance) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "BusinessBankModule.DailyBalance";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
