import { useTranslation } from "react-i18next";

const LanguageSelector = () => {
  const { i18n } = useTranslation();

  const onSelectLanguage = (language) => {
    i18n.changeLanguage(language);
    localStorage.setItem("lang", language);
  };
  return (
    <>
      <img
        role="button"
        src="https://flagcdn.com/24x18/tr.png"
        width="24"
        height="18"
        alt="Turkisch"
        onClick={() => onSelectLanguage("tr")}
      />
      <img
        role="button"
        src="https://flagcdn.com/24x18/us.png"
        width="24"
        height="18"
        alt="Englisch"
        onClick={() => onSelectLanguage("en")}
      />
    </>
  );
};

export default LanguageSelector;
