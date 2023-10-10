export function Input(prop) {
  const { id, label, error, onChange } = props;

  return (
    <div className="mb-3">
      <label htmlFor={id} className="form-label">
        {label}
      </label>
      <input
        id={id}
        className={error ? "form-control is-invalid" : "form-control"}
        onChange={onChange}
      />
      <div className="invalid-feedback">{errors.username}</div>
    </div>
  );
}
